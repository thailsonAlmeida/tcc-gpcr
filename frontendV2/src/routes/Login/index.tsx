import imagePerson from "../../assets/login-person.svg";
import logoGPC from "../../assets/logo-gpcr-white.svg";
import "./styles.css";

export default function Login() {
  return (
    <>
      <div className="login-container">
        <div className="login-container-left">            
          <section className="gpcr-container">
          <div className="form-logo"><img src={logoGPC} alt="Logo" /></div>
            <div className="gpcr-login-form-container">
            
              <form className="gpcr-form">
                <h2>Login</h2>

                <div className="gpcr-form-controls-container">
                  <div>
                    <input
                      name="username"
                      className="gpcr-form-control"
                      type="text"
                      placeholder="Email"
                    />
                    <div className="gpcr-form-error"></div>
                  </div>

                  <div>
                    <input
                      name="password"
                      className="gpcr-form-control"
                      type="password"
                      placeholder="Senha"
                    />
                  </div>
                </div>

                <div className="gpcr-login-form-buttons gpcr-mt20">
                  <button type="submit" className="gpcr-btn gpcr-btn-blue">
                    Acessar
                  </button>
                </div>
              </form>
            </div>
          </section>
        </div>

        <div className="login-container-rigth">
          <img src={imagePerson} alt="" />
        </div>
      </div>
    </>
  );
}
