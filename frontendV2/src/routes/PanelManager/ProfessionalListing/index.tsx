import iconEdit from "../../../assets/edit.svg";
import iconDelete from "../../../assets/delete.svg";
import iconRelatory from "../../../assets/relatory.svg";
import ButtonNextPage from "../../../components/ButtonNextPage";
import ButtonPrimary from "../../../components/ButtonPrimary";
import SearchBar from "../../../components/SearchBar";
import * as professionalService from "../../../services/professional-service";
import { ProfessionalDTO } from "../../../models/professionals";
import { useEffect, useState } from "react";

export default function ProfessionalListing() {
  const [professionals, setProfessionals] = useState<ProfessionalDTO[]>([]);

  useEffect(() => {
    professionalService.findAll().then((response) => {
      setProfessionals(response.data.content);
    });
  }, []);

  return (
    <main>
      <section className="gpcr-panel">
        <div className="gpcr-panel-title">Professinal</div>

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
              {professionals.map((patient) => (
                <tr key={patient.id}>
                  <td className="gpcr-txt-left">{patient.name}</td>
                  <td className="gpcr-tb768">{patient.cpf}</td>
                  <td className="gpcr-txt-left">{patient.phone1}</td>
                  <td className="gpcr-tb576">{patient.phone2}</td>
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
              ))}
            </tbody>
          </table>
        </div>

        <ButtonNextPage />
      </section>
    </main>
  );
}
