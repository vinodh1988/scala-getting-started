def print_combinations(elements, r):
    def backtrack(start, path):
        # Print the combination only if it is of length r
        if len(path) == r:
            print(path)
            return  # Stop further recursion for this path as it has the required length

        # Explore further elements to form combinations
        for i in range(start, len(elements)):
            # Include the element at index i into the current combination path
            path.append(elements[i])
            # Recurse with the current element included
            backtrack(i + 1, path)
            # Backtrack, remove the element before moving to the next
            path.pop()

    # Start backtracking from the first index with an empty path
    backtrack(0, [])

# Example usage: 10 elements, choosing combinations of 3
elements = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
print_combinations(elements, 3)
