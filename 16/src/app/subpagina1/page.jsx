import Link from 'next/link';
import styles from '../layout.module.css';

export default function Page() {
    return (
        <div className={styles.paragraphs}>
            <p>Subpágina 1 (definida em app/subpagina1/page.js)</p>
            <p><Link href="/">Página principal</Link></p>
            <p><Link href="/subpagina2">Subpágina 2</Link></p>
        </div>
    );
}
