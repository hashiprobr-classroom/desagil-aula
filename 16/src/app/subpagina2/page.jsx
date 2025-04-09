import Link from 'next/link';
import styles from '../layout.module.css';

export default function Page() {
    return (
        <div className={styles.paragraphs}>
            <p>Subpágina 2 (definida em app/subpagina2/page.js)</p>
            <p><Link href="/">Página principal</Link></p>
            <p><Link href="/subpagina1">Subpágina 1</Link></p>
        </div>
    );
}
