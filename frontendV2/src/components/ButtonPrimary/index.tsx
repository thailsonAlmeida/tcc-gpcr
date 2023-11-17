import './styles.css';

type Props = {
    text: string,
};

export default function ButtonPrimary({ text } : Props) {
    return(
        <div className="gpcr-panel-button-primary">{text}</div>
    );
}