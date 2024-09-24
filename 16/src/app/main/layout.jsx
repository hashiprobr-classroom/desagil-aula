import { SignOutButton } from "@clerk/nextjs";
import styles from './layout.module.css';

export default function Layout({ children }) {
    return (
        <>
            <header className={styles.header}>
                <p>Cabeçalho definido em app/main/layout.js</p>
                <SignOutButton className={styles.auth}>sign out</SignOutButton>
            </header>
            <main className={styles.main}>
                {children}
            </main>
        </>
    );
}
