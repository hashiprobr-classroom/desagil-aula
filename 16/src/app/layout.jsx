/*
 * NÃO MUDE NADA A MENOS QUE TENHA UM BOM MOTIVO.
 * E, mesmo que tenha, confirme com o professor.
 */

import { Inter } from 'next/font/google';
import { ClerkProvider } from '@clerk/nextjs'
import './globals.css';

const inter = Inter({ subsets: ['latin'] });

export const metadata = {
    title: 'Frontend',
};

export default function RootLayout({ children }) {
    return (
        <ClerkProvider>
            <html lang="pt-br">
                <body className={inter.className}>{children}</body>
            </html>
        </ClerkProvider>
    );
}
