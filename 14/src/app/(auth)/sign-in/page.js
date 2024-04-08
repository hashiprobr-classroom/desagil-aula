import { SignIn } from "@clerk/nextjs";
import styles from './page.module.css';

export default function Page() {
    return (
        <>
            <p className={styles.description}>
                Página definida em app/(auth)/sign-in/page.js
            </p>
            <SignIn
                signUpUrl="/sign-up"
            />
        </>
    );
}
