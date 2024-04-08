/*
 * NÃO MUDE NADA A MENOS QUE TENHA UM BOM MOTIVO.
 * E, mesmo que tenha, confirme com o professor.
 */

import { NextResponse } from 'next/server';
import { authMiddleware } from '@clerk/nextjs';

function redirect(path, req) {
    const url = new URL(path, req.url);
    return NextResponse.redirect(url);
}

export default authMiddleware({
    publicRoutes: [
        '/',
        '/sign-in',
        '/sign-up',
    ],

    afterAuth(auth, req) {
        if (auth.userId) {
            if (auth.isPublicRoute) {
                return redirect('/main', req);
            }
        } else {
            if (!auth.isPublicRoute) {
                return redirect('/sign-in', req);
            }
        }
        return NextResponse.next();
    },
});

export const config = {
    matcher: ['/((?!.+\\.[\\w]+$|_next).*)', '/(api|trpc)(.*)'],
};
