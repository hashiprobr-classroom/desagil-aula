'use client'

import { useState, useEffect } from 'react';
import Link from 'next/link';

import { GET } from '../_lib/actions';

import styles from './page.module.css';

export default function Home() {
    const [gatos, setGatos] = useState([]);
    const [erro, setErro] = useState('');

    useEffect(() => {
        async function baixarGatos() {
            try {
                const resposta = await GET('/gatos');
                setGatos(resposta);
            } catch (error) {
                setErro(error.message);
            }
        }
        baixarGatos();
    }, []);

    return (
        <div className={styles.container}>
            {erro ? (
                <p>{erro}</p>
            ) : (
                gatos.map((gato) => <p key={gato.id}><Link href={'/detalhes/' + gato.id}>{gato.nome}</Link></p>)
            )}
        </div>
    );
}
