import Link from 'next/link';

import styles from './layout.module.css';

export default function Layout({ children }) {
    return (
        <>
            <header className={styles.header}>
                <p>Cabeçalho definido em app/(root)/layout.js</p>
                <nav className={styles.menu}>
                    <Link href="/">Principal</Link>
                    <Link href="/adicionar">Adicionar</Link>
                    <Link href="/todos">Todos</Link>
                </nav>
            </header>
            <main className={styles.main}>
                {children}
            </main>
        </>
    );
}
