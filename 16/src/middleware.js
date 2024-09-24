/*
 * NÃO MUDE NADA A MENOS QUE TENHA UM BOM MOTIVO.
 * E, mesmo que tenha, confirme com o professor.
 */

import { clerkMiddleware, createRouteMatcher } from '@clerk/nextjs/server';
import { NextResponse } from 'next/server';

const isPublicRoute = createRouteMatcher([
    '/',
    '/sign-in(.*)',
    '/sign-up(.*)',
]);

function redirect(path, request) {
    const url = new URL(path, request.url);
    return NextResponse.redirect(url);
}

export default clerkMiddleware((auth, request) => {
    if (auth().userId) {
        if (isPublicRoute(request)) {
            return redirect('/main', request);
        }
    } else {
        if (!isPublicRoute(request)) {
            return redirect('/sign-in', request);
        }
    }
    return NextResponse.next();
});

export const config = {
    matcher: [
        '/((?!_next|[^?]*\\.(?:html?|css|js(?!on)|jpe?g|webp|png|gif|svg|ttf|woff2?|ico|csv|docx?|xlsx?|zip|webmanifest)).*)',
        '/(api|trpc)(.*)',
    ],
};
