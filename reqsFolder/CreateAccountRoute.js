const express = require("express");
const router = express.Router();

router.use(express.urlencoded({extended: true}))
router.use(express.json())

router.post("/android/auth/createAccount", (req,res) => {
    const { email, password } = req.body

    console.log("Email: " + email);
    console.log("Password: " + password);

    res.status(200).json({
        status: 200,
        email: email,
    });

});

module.exports = router;