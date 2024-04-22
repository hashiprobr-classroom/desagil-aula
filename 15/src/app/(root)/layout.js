import Link from 'next/link';

import styles from './layout.module.css';

export default function Layout({ children }) {
    return (
        <>
            <header className={styles.header}>
                <p>Cabeçalho definido em app/(root)/layout.js</p>
                <navbar className={styles.menu}>
                    <Link href="/">Principal</Link>
                    <Link href="/pagina1">Página 1</Link>
                    <Link href="/pagina2">Página 2</Link>
                </navbar>
            </header>
            <main className={styles.main}>
                {children}
            </main>
        </>
    );
}
