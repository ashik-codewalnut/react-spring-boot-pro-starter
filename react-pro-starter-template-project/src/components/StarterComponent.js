import React, { useEffect, useState } from "react";
import { fetchData } from "../services/api";

function StarterComponent() {
  const [data, setData] = useState(null);

  useEffect(() => {
    fetchData()
      .then((response) => setData(response.data.message))
      .catch((error) => console.error(error));
  }, []);

  return (
    <center>
      <div>{data ? <h2>{data}</h2> : <h2>Loading...</h2>}</div>
    </center>
  );
}

export default StarterComponent;
