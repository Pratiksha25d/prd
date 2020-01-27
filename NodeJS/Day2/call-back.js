fs=require('fs');
function readDirectories(err,data){ //callback defined as function
	console.log('data :',data);
}
fs.readdir('/Users/pdq5936/Desktop',readDirectories);

console.log("This comes after...");