import Link from 'next/link';
import Image from 'next/image';

import styles from './page.module.css';

import insper from '../../public/insper.png';

export default function Home() {
    return (
        <div className={styles.paragraphs}>
            {/* Quando a imagem é local, width e height não são obrigatórios. */}
            <Image src={insper} alt="Logotipo do Insper" />

            <p>Página principal (definida em app/page.js)</p>
            <p><Link href="/subpagina1">Subpágina 1</Link></p>
            <p><Link href="/subpagina2">Subpágina 2</Link></p>
        </div>
    );
}
