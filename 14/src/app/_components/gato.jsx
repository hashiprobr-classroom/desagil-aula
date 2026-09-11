import styles from './gato.module.css';

export const SEXOS = {
    FEMEA: 'Fêmea',
    MACHO: 'Macho',
}

export default function Gato(props) {
    const gato = props.gato;

    return (
        <div className={styles.gato}>
            <p><span className={styles.titulo}>Nome:</span> {gato.nome}</p>
            <p><span className={styles.titulo}>Sexo:</span> {SEXOS[gato.sexo]}</p>
            <p><span className={styles.titulo}>Raça:</span> {gato.raca}</p>
            <p><span className={styles.titulo}>Pelagem:</span> {gato.tipoDePelagem}</p>
            <p><span className={styles.titulo}>Olhos:</span> {gato.corDosOlhos}</p>
            <p><span className={styles.titulo}>Nascimento:</span> {gato.dataDeNascimento}</p>
            <p><span className={styles.titulo}>Resgate:</span> {gato.dataDeResgate}</p>
        </div>
    );
}
