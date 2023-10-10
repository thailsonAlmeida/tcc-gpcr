import React from "react";
import './style.css';
import { ReactComponent as ArrowIcon } from '../../assets/arrow.svg';
import { ReactComponent as PersonHomeImage } from '../../assets/person-home.svg';
import { Link } from 'react-router-dom';

const Home = () => (
    <div className="home-container">
        <div className="home-text">
            <h1 className="home-text-title"> Gestão de Procedimento e Relatórios</h1>
            <h3 className="home-text-subtitle">Sistema em desenvolvimento...</h3>
            
            <Link to="/managers">
                <div className="home-actions">
                    <button className="home-btn">
                        ACESSAR
                    </button>
                    <div className="home-btn-icon">
                        <ArrowIcon />
                    </div>                    
                </div>
            </Link>
        </div>
        <PersonHomeImage className="home-image" />
    </div>
);

export default Home;