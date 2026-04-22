'use client'

import { useState } from 'react';

import { SEXOS } from '../_components/gato';

import { POST } from '../_lib/actions';

import styles from './page.module.css';

const keys = Object.keys(SEXOS);

export default function Home() {
    const [nome, setNome] = useState('');
    const [sexo, setSexo] = useState('FEMEA');
    const [pelagem, setPelagem] = useState('');
    const [olhos, setOlhos] = useState('');

    const [enviando, setEnviando] = useState(false);
    const [erro, setErro] = useState('');

    function mudaNome(e) {
        const value = e.target.value;
        setNome(value);
    }

    function mudaSexo(e) {
        const value = e.target.value;
        setSexo(value);
    }

    function mudaPelagem(e) {
        const value = e.target.value;
        setPelagem(value);
    }

    function mudaOlhos(e) {
        const value = e.target.value;
        setOlhos(value);
    }

    async function envia() {
        const gato = {
            'nome': nome,
            'sexo': sexo,
            'raca': 'SRD',
            'tipoDePelagem': pelagem,
            'corDosOlhos': olhos,
            'dataDeNascimento': '2000-01-30',
            'dataDeResgate': '2000-01-30',
        }

        setEnviando(true);
        setErro('');

        try {
            await POST('/gatos', gato);
        } catch (error) {
            setErro(error.message);
        } finally {
            setEnviando(false);
        }
    }

    return (
        <div className={styles.container}>
            <p>
                <label htmlFor="nome">Nome: </label>
                <input id="nome" type="text" value={nome} onChange={mudaNome} />
            </p>
            <p>
                <label htmlFor="sexo">Sexo: </label>
                <select id="sexo" value={sexo} onChange={mudaSexo}>
                    {keys.map((key) => <option key={key} value={key}>{SEXOS[key]}</option>)}
                </select>
            </p>
            <p>
                <label htmlFor="pelagem">Pelagem: </label>
                <input id="pelagem" type="text" value={pelagem} onChange={mudaPelagem} />
            </p>
            <p>
                <label htmlFor="olhos">Olhos: </label>
                <input id="olhos" type="text" value={olhos} onChange={mudaOlhos} />
            </p>

            {enviando ? (
                <p>aguarde...</p>
            ) : (
                <button onClick={envia}>Enviar</button>
            )}

            {erro && (
                <p>Erro: {erro}</p>
            )}
        </div>
    );
}
