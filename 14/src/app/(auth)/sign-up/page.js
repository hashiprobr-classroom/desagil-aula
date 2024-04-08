import { SignUp } from "@clerk/nextjs";
import styles from './page.module.css';

export default function Page() {
    return (
        <>
            <p className={styles.description}>
                Página definida em app/(auth)/sign-up/page.js
            </p>
            <SignUp
                signInUrl="/sign-in"
            />
        </>
    );
}
