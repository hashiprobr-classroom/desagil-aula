import Link from 'next/link';
import Image from 'next/image';

import styles from './page.module.css';

import insper from '../../public/insper.png';

export default function Home() {
    return (
        <>
            <header className={styles.header}>
                <p>Página definida em app/page.js</p>
                <div className={styles.auth}>
                    <Link className={styles.signIn} href="/sign-in">sign in</Link>
                    <Link className={styles.signUp} href="/sign-up">sign up</Link>
                </div>
            </header>
            <main className={styles.main}>
                {/* Quando a imagem é local, width e height não são obrigatórios. */}
                <Image src={insper} alt="Logotipo do Insper" />
            </main>
        </>
    );
}
