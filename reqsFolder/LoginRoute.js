const express = require("express");
const router = express.Router();

const correctEmail = process.env.CorrectEmail
const correctPassword = process.env.password

router.post("/android/auth/login", (req,res) => {
    const {email,password} = req.body;

    console.log("Recieved the ping");

    try {
        // VALIDATE USER INPUT
            if (email != correctEmail || password != correctPassword) {
                res.status(400).json({
                    status: 400,
                    message: "User not found"
                });
            } else {
                res.status(200).json({
                    status: 200,
                    mesage: "Successful",
                    cryptic: "SupremeMarjella"
                })
            }

    } catch (error) {
        
    }
});

module.exports = router;