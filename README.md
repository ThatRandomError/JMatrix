# JMatrix
Overview:
JMatrix is a Java class that represents a matrix and provides various operations such as matrix addition, multiplication, exponentiation, and more. It is implemented using a 2D ArrayList to hold Double values and supports element-wise as well as matrix-level operations.

Class Structure:
Fields:
private ArrayList<ArrayList<Double>> matrix: Stores the matrix as a 2D list of Double values.
Constructors:
JMatrix(ArrayList<ArrayList<Double>> matrix):
Constructor that initializes the matrix using an existing 2D ArrayList.
JMatrix():
Default constructor that initializes an empty matrix (an empty ArrayList).
Static Methods:
exp(JMatrix matrix):

Applies the exponential function (e^x) to each element of the matrix.
Returns a new matrix with the result.
power(JMatrix matrix, double exponent):

Raises each element of the matrix to the given power.
Returns a new matrix with the result.
sum(JMatrix matrix):

Computes the sum of all elements in the matrix.
Returns the sum as a double.
addBy(JMatrix matrix, double num):

Adds the given num to each element of the matrix.
Returns a new matrix with the result.
subBy(JMatrix matrix, double num):

Subtracts the given num from each element of the matrix.
Returns a new matrix with the result.
subByMatrix(JMatrix matrix, double num):

Divides num by each element of the matrix.
Returns a new matrix with the result.
divBy(JMatrix matrix, double num):

Divides each element of the matrix by the given num.
Returns a new matrix with the result.
mulBy(JMatrix matrix, double num):

Multiplies each element of the matrix by the given num.
Returns a new matrix with the result.
divByMatrix(JMatrix matrix, double num):

Divides the given num by each element of the matrix (element-wise division).
Returns a new matrix with the result.
mul(JMatrix matrix1, JMatrix matrix2):

Performs element-wise multiplication of two matrices.
Matrices must have the same dimensions.
Returns a new matrix with the result.
add(JMatrix matrix1, JMatrix matrix2):

Adds two matrices element-wise.
Matrices must have the same dimensions.
Returns a new matrix with the result.
sub(JMatrix matrix1, JMatrix matrix2):

Subtracts the second matrix from the first matrix element-wise.
Matrices must have the same dimensions.
Returns a new matrix with the result.
dot(JMatrix matrix1, JMatrix matrix2):

Performs matrix multiplication (dot product) between two matrices.
The number of columns in the first matrix must equal the number of rows in the second matrix.
Returns the result as a new matrix.
outer(JMatrix matrix1, JMatrix matrix2):

Computes the outer product of two matrices.
Assumes the input matrices are vectors (1D matrices).
Returns the outer product as a new matrix.
transpose(JMatrix matrix):

Transposes the matrix (flips rows and columns).
Returns the transposed matrix.
convertArray(Double[][] array):

Converts a 2D array of Double values to a JMatrix.
Returns the new matrix.
toJMatrix(ArrayList<Double> list):

Converts a 1D list of Double values into a 1-row matrix.
Returns the new matrix.
zeros(int rows, int cols):

Generates a matrix filled with zeros.
Returns the new matrix.
ones(int rows, int cols):

Generates a matrix filled with ones.
Returns the new matrix.
random(int rows, int cols):

Generates a matrix filled with random values from a Gaussian distribution.
Returns the new matrix.
Instance Methods:
getList():

Returns the internal matrix as an ArrayList<ArrayList<Double>>.
getMatrix():

Returns a copy of the matrix as a JMatrix.
get(int x, int y):

Returns the element at position (x, y) in the matrix.
getShape():

Returns the dimensions of the matrix as an array [rows, cols].
getHeight():

Returns the number of rows in the matrix.
getWidth():

Returns the number of columns in the matrix.
Private Methods:
multiply2DMatrices(ArrayList<ArrayList<Double>> list1, ArrayList<ArrayList<Double>> list2):
Multiplies two 2D matrices and returns the result.
Used in matrix multiplication (dot product).
Ensures the number of columns in the first matrix matches the number of rows in the second.
Exceptions:
IllegalArgumentException:
Thrown in cases where the dimensions of matrices do not match for operations like addition, subtraction, or multiplication.
Usage Examples:

// Create a 2x2 matrix filled with random values
JMatrix randomMatrix = JMatrix.random(2, 2);

// Add two matrices
JMatrix result = JMatrix.add(matrix1, matrix2);

// Matrix multiplication (dot product)
JMatrix product = JMatrix.dot(matrix1, matrix2);

// Get the sum of all elements in a matrix
double total = JMatrix.sum(matrix);

(this doumcation may or may not been written by chatgpt cause im bad at writing)
