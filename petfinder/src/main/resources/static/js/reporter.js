function saveReporter(){
    var mysql = require('mysql');

    var con = mysql.createConnection({
        host:'jdbc:mysql://database-petfinder.cdkjzkyeanqx.sa-east-1.rds.amazonaws.com:3306/petfinder',
        user:'admin',
        password:'Pa55w.rd',
        database:'com.mysql.cj.jdbc.Driver'
    });

    con.connect(function(err){
        if(err) throw err;
        console.log('connected')
    });
}