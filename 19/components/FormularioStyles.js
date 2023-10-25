import { StyleSheet } from 'react-native';

export default StyleSheet.create({
    container: {
        flexGrow: 1,
    },
    scroll: {
        height: 0, /* Gambiarra necessária para funcionar no navegador. */
        marginTop: 10,
        marginRight: 10,
        marginLeft: 10,
        flexGrow: 1,
    },
    foto: {
        alignSelf: 'center',
        aspectRatio: 1,
        width: '50%',
        marginBottom: 10,
        borderRadius: 50,
    },
    campo: {
        marginBottom: 10,
    }
})
