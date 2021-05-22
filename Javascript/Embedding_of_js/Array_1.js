function start()
{
var n1 = new Array( 5 );
var length =n1.length;
for ( var i = 0; i < length; ++i )
{
n1[ i ] = i;
}
outputArray( "Array n1:", n1, document.getElementById( "output1" ) );
}
function outputArray( heading, theArray, output )
{
var content = "<h2>" + heading + "</h2><table>" +"<thead><th>Index</th><th>Value</th></thead><tbody>";
var length = theArray.length;
for ( var i = 0; i < length; ++i )
{
content=content+"<tr><td>" + i + "</td><td>" + theArray[ i ] +"</td></tr>";
}
content =content+ "</tbody></table>";
output.innerHTML = content;//place the table in the output element;
}
window.addEventListener( "load", start, false );
