> get highest wealth in a row.
> compare to highest wealth of column.
​
[
[1,2,3,5,7,3],
[3,2,1,7,4,6],
[7,3,9,2,8,2]
]
int highest = 0;
for(int i = 0; i < accounts.length; i++){
for(int j = 0; j< accounts[i].length; j++){
wealth += account[i][j];
}
if(wealth > highest){
highest = wealth;
}
return highest;