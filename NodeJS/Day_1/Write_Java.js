const fs = require('fs');
const path = require('path');

fs.writeFile(path.join(__dirname,'/Training_Details','/DET.txt')
   ,'vishwas'
   ,(err)=>{
    if(err) throw err;
    console.log('File has been executed...');
});
