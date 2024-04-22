'use client'

import { useState } from 'react';

import styles from './page.module.css';

export default function Home() {
    const [contador, setContador] = useState(0);

    const [visivel, setVisivel] = useState(true);

    function decrementa() {
        setContador(contador - 1);
    }

    function incrementa() {
        setContador(contador + 1);
    }

    return (
        <div className={styles.container}>
            {visivel && (
                <>
                    <p>
                        Contador: {contador}
                    </p>
                    <p>
                        <button onClick={decrementa}>decrementar</button>
                        <button onClick={incrementa}>incrementar</button>
                    </p>
                </>
            )}
            <p>
                {visivel ? (
                    <button onClick={() => setVisivel(false)}>esconder</button>
                ) : (
                    <button onClick={() => setVisivel(true)}>mostrar</button>
                )}
            </p>
        </div>
    );
}
