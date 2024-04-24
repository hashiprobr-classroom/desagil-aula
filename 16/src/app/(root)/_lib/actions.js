'use server'

import settings from '../../../settings.json';

async function request(path, options) {
    const response = await fetch(settings.url + path, options);

    const message = await response.text();

    if (!response.ok) {
        const error = new Error(message);
        error.status = response.status;
        throw error;
    }

    if (message) {
        return JSON.parse(message);
    }

    return null;
}

async function send(path, method, body) {
    return await request(path, {
        method,
        headers: {
            'Content-Type': 'application/json',
        },
        body: JSON.stringify(body),
    });
}

export async function GET(path) {
    return await request(path);
}

export async function POST(path, body) {
    return await send(path, 'POST', body);
}
