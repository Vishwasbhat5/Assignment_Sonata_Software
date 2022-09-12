const fs = require('fs');
const path = require('path');


fs.mkdir(path.join(__dirname, 'TrainingDetails'), (err) => {
    if (err) {
        return console.error(err);
    }
    console.log('Directory has been created ');
});