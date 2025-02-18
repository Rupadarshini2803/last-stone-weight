class last stone weight{ 
public void setzeros(int[][] matrix){
int rowlength=matrix.length;
int collength=matrix[0].length;
int[] row=new [rowlength];
int[] col=new [collength];
for(int i=0;i<rowlength;i++){
for(int j=0;j<collength;j++){
if(matrix[i][j]==0){
row[i]=1;
col[j]=1;}
}
}
}
}
