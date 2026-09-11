/*
 * NÃO MUDE NADA A MENOS QUE TENHA UM BOM MOTIVO.
 * E, mesmo que tenha, confirme com o professor.
 */

import { Inter } from 'next/font/google';
import Link from 'next/link';
import './globals.css';
import styles from './layout.module.css';

const inter = Inter({ subsets: ['latin'] });

export const metadata = {
    title: 'Frontend',
};

export default function RootLayout({ children }) {
    return (
        <html lang="pt-br">
            <body className={inter.className}>
                <header className={styles.header}>
                    <p>Cabeçalho definido em app/layout.jsx</p>
                    <nav className={styles.menu}>
                        <Link href="/">Principal</Link>
                        <Link href="/adicionar">Adicionar</Link>
                        <Link href="/todos">Todos</Link>
                    </nav>
                </header>
                <main className={styles.main}>
                    {children}
                </main>
            </body>
        </html>
    );
}
