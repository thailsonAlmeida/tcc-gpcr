import "./styles.css";

export default function SearchBar() {
  return (
    <form className="gpcr-search-bar">
      <button type="submit">🔎︎</button>
      <input type="text" placeholder="Nome do Paciente" />
      <button type="reset">🗙</button>
    </form>
  );
}
