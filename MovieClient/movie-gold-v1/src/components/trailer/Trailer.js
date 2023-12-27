import { useParams } from "react-router-dom";
import ReactPlayer from 'react-player';
import './Trailer.css';
import React from 'react';

const Trailer = () => {

    let params = useParams();
    const key = params.ytTrailerId;

    return (
        <div className='react-player-container'>
            <div>
                {(key != null) ?
                    <ReactPlayer controls="true" playing={true} url={`https://www.youtube.com/watch?v=${key}`} />
                    : null
                }
            </div>
        </div>
    )
}

export default Trailer;
