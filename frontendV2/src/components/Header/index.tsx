import './styles.css';
import iconDsh from '../../assets/dsh-patient.svg';
import iconPatient from '../../assets/icon-patient.svg';
import iconProfessional from '../../assets/icon-professional.svg';
import iconProcedure from '../../assets/icon-procedure.svg';

export default function Header() {
    return (
        <header className="gpcr-header">
            <nav className="gpcr-container">
                <div className="gpcr-navbar">
                    <div className="gpcr-menu-items-container">
                        <div className="gpcr-menu-item">
                            <img src={iconDsh} alt="Dashboard" />
                        </div>
                        <div className="gpcr-menu-item gpcr-menu-item-active">
                            <img src={iconPatient} alt="Pacientes" />
                        </div>
                        <div className="gpcr-menu-item">
                            <img src={iconProfessional} alt="Profissionais" />
                        </div>
                        <div className="gpcr-menu-item">
                            <img src={iconProcedure} alt="Procedimentos" />
                        </div>
                    </div>
                </div>

                <div className="gpcr-navbar gpcr-user">
                    <div className='gpcr-user-email'>
                        manager@gmail.com
                    </div>
                    <div className='gpcr-user-logout'>
                        Sair
                    </div>
                </div>
            </nav>
        </header>
    );
}