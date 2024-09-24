import Link from 'next/link';
import styles from './layout.module.css';

export default function Page() {
    return (
        <div className={styles.paragraphs}>
            <p>Página principal (definida em app/main/page.js)</p>
            <p><Link href="/main/subpagina1">Subpágina 1</Link></p>
            <p><Link href="/main/subpagina2">Subpágina 2</Link></p>
        </div>
    );
}
