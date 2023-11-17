import ButtonPrimary from "../../../components/ButtonPrimary";
import SearchBar from "../../../components/SearchBar";
import iconEdit from "../../../assets/edit.svg";
import iconDelete from "../../../assets/delete.svg";
import iconRelatory from "../../../assets/relatory.svg";
import "./styles.css";
import ButtonNextPage from "../../../components/ButtonNextPage";

export default function PatientListing() {
  return (
    <>

      <main>

        <section className="gpcr-panel">

          <div className="gpcr-panel-title">Paciente</div>

          <ButtonPrimary text="Cadastrar" />
          <SearchBar />

          <div className="gpcr-panel-form">
            
            <table className="gpcr-table gpcr-mb20 gpcr-mt20">
              
              <thead>
                <tr>
                  <th className="gpcr-txt-left">Nome</th>
                  <th className="gpcr-tb768">CPF</th>
                  <th className="gpcr-txt-left">Telefone</th>
                  <th className="gpcr-tb576">Telefone</th>
                  <th>Ações</th>
                </tr>
              </thead>

              <tbody>
                
                <tr>
                  <td className="gpcr-txt-left">Jill Castro Alves</td>
                  <td className="gpcr-tb768">501.985.698-85</td>
                  <td className="gpcr-txt-left">(15) 9 9816-28987</td>
                  <td className="gpcr-tb576">(15) 9 9736-38987</td>
                  <td>
                    <img
                      className="gpcr-product-listing-btn"
                      src={iconEdit}
                      alt="Editar"
                    />
                    <img
                      className="gpcr-product-listing-btn"
                      src={iconDelete}
                      alt="Deletar"
                    />
                    <img
                      className="gpcr-product-listing-btn"
                      src={iconRelatory}
                      alt="Relatorio"
                    />
                  </td>
                </tr>

                <tr>
                  <td className="gpcr-txt-left">Jill Castro Alves</td>
                  <td className="gpcr-tb768">501.985.698-85</td>
                  <td className="gpcr-txt-left">(15) 9 9816-28987</td>
                  <td className="gpcr-tb576">(15) 9 9736-38987</td>
                  <td>
                    <img
                      className="gpcr-product-listing-btn"
                      src={iconEdit}
                      alt="Editar"
                    />
                    <img
                      className="gpcr-product-listing-btn"
                      src={iconDelete}
                      alt="Deletar"
                    />
                    <img
                      className="gpcr-product-listing-btn"
                      src={iconRelatory}
                      alt="Relatorio"
                    />
                  </td>
                </tr>

                <tr>
                  <td className="gpcr-txt-left">Jill Castro Alves</td>
                  <td className="gpcr-tb768">501.985.698-85</td>
                  <td className="gpcr-txt-left">(15) 9 9816-28987</td>
                  <td className="gpcr-tb576">(15) 9 9736-38987</td>
                  <td>
                    <img
                      className="gpcr-product-listing-btn"
                      src={iconEdit}
                      alt="Editar"
                    />
                    <img
                      className="gpcr-product-listing-btn"
                      src={iconDelete}
                      alt="Deletar"
                    />
                    <img
                      className="gpcr-product-listing-btn"
                      src={iconRelatory}
                      alt="Relatorio"
                    />
                  </td>
                </tr>

                <tr>
                  <td className="gpcr-txt-left">Jill Castro Alves</td>
                  <td className="gpcr-tb768">501.985.698-85</td>
                  <td className="gpcr-txt-left">(15) 9 9816-28987</td>
                  <td className="gpcr-tb576">(15) 9 9736-38987</td>
                  <td>
                    <img
                      className="gpcr-product-listing-btn"
                      src={iconEdit}
                      alt="Editar"
                    />
                    <img
                      className="gpcr-product-listing-btn"
                      src={iconDelete}
                      alt="Deletar"
                    />
                    <img
                      className="gpcr-product-listing-btn"
                      src={iconRelatory}
                      alt="Relatorio"
                    />
                  </td>
                </tr>

                <tr>
                  <td className="gpcr-txt-left">Jill Castro Alves</td>
                  <td className="gpcr-tb768">501.985.698-85</td>
                  <td className="gpcr-txt-left">(15) 9 9816-28987</td>
                  <td className="gpcr-tb576">(15) 9 9736-38987</td>
                  <td>
                    <img
                      className="gpcr-product-listing-btn"
                      src={iconEdit}
                      alt="Editar"
                    />
                    <img
                      className="gpcr-product-listing-btn"
                      src={iconDelete}
                      alt="Deletar"
                    />
                    <img
                      className="gpcr-product-listing-btn"
                      src={iconRelatory}
                      alt="Relatorio"
                    />
                  </td>
                </tr>

                <tr>
                  <td className="gpcr-txt-left">Jill Castro Alves</td>
                  <td className="gpcr-tb768">501.985.698-85</td>
                  <td className="gpcr-txt-left">(15) 9 9816-28987</td>
                  <td className="gpcr-tb576">(15) 9 9736-38987</td>
                  <td>
                    <img
                      className="gpcr-product-listing-btn"
                      src={iconEdit}
                      alt="Editar"
                    />
                    <img
                      className="gpcr-product-listing-btn"
                      src={iconDelete}
                      alt="Deletar"
                    />
                    <img
                      className="gpcr-product-listing-btn"
                      src={iconRelatory}
                      alt="Relatorio"
                    />
                  </td>
                </tr>

                <tr>
                  <td className="gpcr-txt-left">Jill Castro Alves</td>
                  <td className="gpcr-tb768">501.985.698-85</td>
                  <td className="gpcr-txt-left">(15) 9 9816-28987</td>
                  <td className="gpcr-tb576">(15) 9 9736-38987</td>
                  <td>
                    <img
                      className="gpcr-product-listing-btn"
                      src={iconEdit}
                      alt="Editar"
                    />
                    <img
                      className="gpcr-product-listing-btn"
                      src={iconDelete}
                      alt="Deletar"
                    />
                    <img
                      className="gpcr-product-listing-btn"
                      src={iconRelatory}
                      alt="Relatorio"
                    />
                  </td>
                </tr>

                <tr>
                  <td className="gpcr-txt-left">Jill Castro Alves</td>
                  <td className="gpcr-tb768">501.985.698-85</td>
                  <td className="gpcr-txt-left">(15) 9 9816-28987</td>
                  <td className="gpcr-tb576">(15) 9 9736-38987</td>
                  <td>
                    <img
                      className="gpcr-product-listing-btn"
                      src={iconEdit}
                      alt="Editar"
                    />
                    <img
                      className="gpcr-product-listing-btn"
                      src={iconDelete}
                      alt="Deletar"
                    />
                    <img
                      className="gpcr-product-listing-btn"
                      src={iconRelatory}
                      alt="Relatorio"
                    />
                  </td>
                </tr>

                <tr>
                  <td className="gpcr-txt-left">Jill Castro Alves</td>
                  <td className="gpcr-tb768">501.985.698-85</td>
                  <td className="gpcr-txt-left">(15) 9 9816-28987</td>
                  <td className="gpcr-tb576">(15) 9 9736-38987</td>
                  <td>
                    <img
                      className="gpcr-product-listing-btn"
                      src={iconEdit}
                      alt="Editar"
                    />
                    <img
                      className="gpcr-product-listing-btn"
                      src={iconDelete}
                      alt="Deletar"
                    />
                    <img
                      className="gpcr-product-listing-btn"
                      src={iconRelatory}
                      alt="Relatorio"
                    />
                  </td>
                </tr>

              </tbody>

            </table>

          </div>

          <ButtonNextPage />

        </section>        

      </main>
    </>
  );
}
