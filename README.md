# JMatrix
JMatrix does basic allows matrix operations for 2d and 1d matrixs


**JMatrix Class Documentation**
The JMatrix class provides a structure for creating and manipulating two-dimensional matrices using ArrayList<Double>. It supports various mathematical operations, including addition, subtraction, multiplication, exponentiation, and more.

Fields
matrix: A two-dimensional ArrayList that represents the matrix.
Constructors
JMatrix(ArrayList<ArrayList<Double>> matrix): Initializes a new instance of JMatrix with the specified two-dimensional matrix.
JMatrix(): Initializes an empty matrix.
Static Methods
exp(JMatrix matrix): Returns a new JMatrix where each element is the exponential of the corresponding element in the input matrix.

power(JMatrix matrix, double exponent): Returns a new JMatrix where each element is raised to the specified exponent.

sum(JMatrix matrix): Computes and returns the sum of all elements in the matrix.

addBy(JMatrix matrix, double num): Returns a new JMatrix with each element increased by the specified number.

subBy(JMatrix matrix, double num): Returns a new JMatrix with each element decreased by the specified number.

subByMatrix(JMatrix matrix, double num): Returns a new JMatrix where each element is calculated as num - element.

divBy(JMatrix matrix, double num): Returns a new JMatrix with each element divided by the specified number.

mulBy(JMatrix matrix, double num): Returns a new JMatrix with each element multiplied by the specified number.

divByMatrix(JMatrix matrix, double num): Returns a new JMatrix where each element is calculated as num / element.

add(JMatrix matrix1, JMatrix matrix2): Returns a new JMatrix that is the element-wise sum of the two input matrices.

sub(JMatrix matrix1, JMatrix matrix2): Returns a new JMatrix that is the element-wise difference of the two input matrices.

mul(JMatrix matrix1, JMatrix matrix2): Returns a new JMatrix that is the element-wise product of the two input matrices.

dot(JMatrix matrix1, JMatrix matrix2): Computes the dot product of two matrices and returns the resulting JMatrix.

zeros(int rows, int cols): Creates and returns a new JMatrix filled with zeros.

ones(int rows, int cols): Creates and returns a new JMatrix filled with ones.

random(int rows, int cols): Creates and returns a new JMatrix with random values generated from a Gaussian distribution.

convertArray(Double[][] array): Converts a two-dimensional array into a JMatrix.

Instance Methods
getList(): Returns the underlying matrix as an ArrayList<ArrayList<Double>>.

get(int x, int y): Returns the element at the specified row (x) and column (y).

getHeight(): Returns the number of rows in the matrix.

getWidth(): Returns the number of columns in the matrix.

ps. the documation was made by chatgpt
