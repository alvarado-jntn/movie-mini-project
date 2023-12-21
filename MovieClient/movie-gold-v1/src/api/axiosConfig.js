import axios from 'axios';

export default axios.create({
    // baseURL: 'http://localhost:8080',
    baseURL: 'https://19d5-2001-5a8-4645-b000-d5b5-adc9-1292-fcf5.ngrok-free.app',
    headers:{"ngrok-skip-browser-warning":"true"} 
});


    /**
     * This is needed because during the development phase, the technology that
     * the remote machine is using to expose the relevant API endpoints is called
     * ngrok. 
     * 
     * We need this setting so our http requests are not blocked by CORS.
     * CORS = cross origin resource sharing. 
     */