import Gato from '../../_components/gato';

import { GET } from '../../_lib/actions';

import styles from './page.module.css';

export default async function Home(props) {
    const id = props.params.id;

    const gato = await GET('/gatos/' + id);

    return (
        <div className={styles.container}>
            <Gato gato={gato} />
        </div>
    );
}
