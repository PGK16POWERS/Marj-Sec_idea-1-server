const express = require("express");
const app = express();
require("dotenv").config();

app.use(express.urlencoded({extended: true}));
app.use(express.json());

const loginRoute = require("./reqsFolder/LoginRoute");

app.use(loginRoute)

app.listen(process.env.PORT, () => {
    console.log("Running on port " + process.env.PORT);
});