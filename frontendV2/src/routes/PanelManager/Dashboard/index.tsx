import CardCancelated from "../../../components/CardCancelated";
import CardConfirmation from "../../../components/CardConfirmation";
import CardPending from "../../../components/CardPending";
import CardRegistrationPatient from "../../../components/CardRegistrationPatient";
import CardRegistrationProfessional from "../../../components/CardRegistrationProfessional";
import "./styles.css";

export default function Dashboard() {
  return (
    <>
      <section className="dsh-panel">
        <div className="dsh-panel-title">
          <h1>Procedimentos</h1>
        </div>

        <div className="dsh-container">
          <CardConfirmation />
          <CardPending />
          <CardCancelated />
        </div>
      </section>

      <section className="dsh-panel">
        <CardRegistrationPatient />
      </section>

      <section className="dsh-panel">
        <CardRegistrationProfessional />
      </section>
    </>
  );
}
