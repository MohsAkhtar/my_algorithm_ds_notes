package hashtable;

public class HashTable {
	// hashtable utilises underlying array
	// we can insert diff data types we are using strings here
	String [] hashArray;
	int arraySize;
	int size = 0; // counter for number of elements in the hash table
	
	public HashTable(int noOfSlots) {
		
		// we need to make sure noOfSlots if prime for double
		// hash tables
		if(isPrime(noOfSlots)) {
			hashArray = new String[noOfSlots]; // initialise hashtable with size of noOfSlots
			arraySize = noOfSlots;
		} else {
			// if not prime we get next prime for input number
			int primeCount = getNextPrime(noOfSlots);
			hashArray = new String[primeCount];
			arraySize = primeCount;
			
			System.out.println("Hash table size given was ot a prime: " + noOfSlots);
			System.out.println("Hash table new size is: " + primeCount);
		}
	}
	
	// PRIME NUMBER FUNCTIONS
	// Check for prime numbers
	private boolean isPrime(int num) {
		for(int i = 2; i*i <= num; i++) {
			if(num % i == 0) {
				return false;
			}
		}
		return true;
	}
	
	private int getNextPrime(int minNumber) {
		for(int i = minNumber; true; i++) { // true means indefinite loop till we break out of it
			if(isPrime(i)) { // increment 'i' till we reach true for isPrime()
				return i;
			}
		}
	}
	
	// HASHING FUNCTIONS
	
	// return preferred index position
	private int hashFunc1(String word) {
		// hashcode gives hash value
		int hashVal = word.hashCode(); // converting string to numeric position
		hashVal = hashVal % arraySize;
		
		// Java can store some values as negatives
		if(hashVal < 0) {
			hashVal += arraySize; // increment arraysize
		}
		
		return hashVal; // ideal index pos we'd like to insert or search in
	}
	
	// return step size greater than 0
	private int hashFunc2(String word) {
		int hashVal = word.hashCode();
		hashVal %= arraySize; // hashVal = hashVal % arraySize
		
		if(hashVal < 0) {
			hashVal += arraySize; // hashVal = hashVal + arraySize
		}
		
		// for a step size - suggested to use a prime number less than arraySize
		return 3 - hashVal % 3; // could be any prime, 7 - hashVal % 7
	}
	
	// insert into hashtable
	public void insert(String word) {
		int hashVal = hashFunc1(word);
		int stepSize = hashFunc2(word);
		
		while(hashArray[hashVal] != null) { // means data is in that loc
			hashVal = hashVal + stepSize;
			hashVal = hashVal % arraySize;
		}
		
		// exiting loop means we have found position to store element
		hashArray[hashVal] = word;
		
		System.out.println("Inserted word: " + word);
		size++; // remember size increases
	}
	
	// searching for value in hashtable
	public String find(String word) {
		// we use same strategy to inserting data
		int hashVal = hashFunc1(word);
		int stepSize = hashFunc2(word);
		
		while(hashArray[hashVal] != null) {
			if(hashArray[hashVal].equals(word)){
				return hashArray[hashVal];
			}
			hashVal = hashVal + stepSize;
			hashVal = hashVal % arraySize;
		}
		
		// if we exit loop we have not found word
		// so we return a value of null
		return hashArray[hashVal];
	}
	
	public void displayTable() {
		System.out.println("\n---TABLE---");
		for(int i = 0; i < arraySize; i++) {
			if(hashArray[i] != null) {
				System.out.print(hashArray[i] + " ");
			} else {
				System.out.print("*null* ");
			}
			System.out.println("");
		}
	}
}
