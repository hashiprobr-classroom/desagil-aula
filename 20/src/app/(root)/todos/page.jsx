import Link from 'next/link';

import { GET } from '../_lib/actions';

import styles from './page.module.css';

export default async function Home() {
    const gatos = await GET('/gatos');

    return (
        <div className={styles.container}>
            {gatos.map((gato) => <p key={gato.id}><Link href={'/detalhes/' + gato.id}>{gato.nome}</Link></p>)}
        </div>
    );
}
