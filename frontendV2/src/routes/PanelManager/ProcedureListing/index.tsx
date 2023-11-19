import ButtonNextPage from "../../../components/ButtonNextPage";
import ButtonPrimary from "../../../components/ButtonPrimary";
import SearchBar from "../../../components/SearchBar";
import iconEdit from "../../../assets/edit.svg";
import iconDelete from "../../../assets/delete.svg";
import iconViewDatails from "../../../assets/icon-viewDetails.svg";
import * as proceduresService from "../../../services/procedure-service";
import { useEffect, useState } from "react";
import { ProcedureDTO } from "../../../models/procedures";

export default function ProcedureListing() {

    const [ procedures, setProcedures ] = useState<ProcedureDTO[]>([]);

    useEffect(() => {
        proceduresService.findAll().then((response) => {
            setProcedures(response.data.content);
        });
    }, [])

    return (
    <main>
      <section className="gpcr-panel">
        <div className="gpcr-panel-title">Procedimentos</div>

        <ButtonPrimary text="Cadastrar" />
        <SearchBar />

        <div className="gpcr-panel-form">
          <table className="gpcr-table gpcr-mb20 gpcr-mt20">
            <thead>
              <tr>
                <th className="gpcr-txt-left">Nome</th>
                <th className="gpcr-txt-left">Data</th>
                <th className="gpcr-txt-left">Inicio</th>
                <th className="gpcr-txt-left">Fim</th>
                <th className="gpcr-txt-left">Status</th>
                <th className="gpcr-txt-left">Professional</th>
                <th>Ações</th>
              </tr>
            </thead>

            <tbody>
              {procedures.map((procedure) => (
                <tr key={procedure.id_procedure}>
                  <td className="gpcr-txt-left">{procedure.id_patient}</td>
                  <td className="gpcr-txt-left">{procedure.data}</td>
                  <td className="gpcr-txt-left">{procedure.start}</td>
                  <td className="gpcr-txt-left">{procedure.finish}</td>
                  <td className="gpcr-txt-left">{procedure.status}</td>
                  <td className="gpcr-txt-left">{procedure.id_professional}</td>
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
                      src={iconViewDatails}
                      alt="Relatorio"
                    />
                  </td>
                </tr>
              ))}
            </tbody>
          </table>
        </div>

        <ButtonNextPage />
      </section>
    </main>
  );
}
