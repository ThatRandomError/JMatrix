# JMatrix
JMatrix does basic allows matrix operations for 2d and 1d matrixs

Class: JMatrix
Fields:
matrix: A 2D ArrayList of Double values representing the matrix.
Constructors:
JMatrix(ArrayList<ArrayList<Double>> matrix): Initializes the JMatrix with a given 2D list of Double values.
JMatrix(): Initializes an empty matrix.
Methods:
Static Methods (Matrix Operations):
exp(JMatrix matrix): Returns a new matrix with the exponential (e^x) of each element in the input matrix.

power(JMatrix matrix, double exponent): Raises each element in the matrix to the power of exponent and returns a new JMatrix.

sum(JMatrix matrix): Calculates and returns the sum of all elements in the matrix.

addBy(JMatrix matrix, double num): Adds the scalar num to every element of the matrix and returns a new matrix.

subBy(JMatrix matrix, double num): Subtracts the scalar num from every element of the matrix and returns a new matrix.

subByMatrix(JMatrix matrix, double num): Subtracts every element of the matrix from num and returns the result.

divBy(JMatrix matrix, double num): Divides each element of the matrix by the scalar num and returns a new matrix.

divByMatrix(JMatrix matrix, double num): Divides num by every element of the matrix and returns the result.

Static Methods (Matrix-to-Matrix Operations):
add(JMatrix matrix1, JMatrix matrix2): Adds two matrices element-wise and returns a new JMatrix. Throws an exception if matrix sizes do not match.

sub(JMatrix matrix1, JMatrix matrix2): Subtracts matrix2 from matrix1 element-wise and returns a new JMatrix. Throws an exception if matrix sizes do not match.

dot(JMatrix matrix1, JMatrix matrix2): Computes the dot product of two matrices. If both matrices are vectors, it computes the outer product; otherwise, it performs standard matrix multiplication.

Utility Methods for Dot Product:
outer(ArrayList<ArrayList<Double>> list1, ArrayList<ArrayList<Double>> list2): Computes the outer product between two 1D lists (vectors).

multiply2DMatrices(ArrayList<ArrayList<Double>> list1, ArrayList<ArrayList<Double>> list2): Multiplies two 2D matrices and returns the result. Throws an exception if matrix dimensions do not align.

Instance Methods:
getList(): Returns the internal 2D ArrayList representing the matrix.

getMatrix(): Returns a deep copy of the JMatrix object.

get(int x, int y): Returns the element at position (x, y).

getHeight(): Returns the number of rows in the matrix.

getWidth(): Returns the number of columns in the matrix (based on the first row).

Static Utility Methods:
zeros(int rows, int cols): Returns a JMatrix of size rows x cols filled with zeros.

ones(int rows, int cols): Returns a JMatrix of size rows x cols filled with ones.

random(int rows, int cols): Returns a JMatrix of size rows x cols with random Gaussian values.

toJMatrix(ArrayList<Double> list): Converts a 1D ArrayList<Double> to a JMatrix with a single row.

convertArray(Double[][] array): Converts a 2D array (Double[][]) to a JMatrix.

Error Handling:
Size Mismatch: Several methods (e.g., add, sub, dot) check that the input matrices have compatible sizes. If they don't, an IllegalArgumentException is thrown with an appropriate message.
