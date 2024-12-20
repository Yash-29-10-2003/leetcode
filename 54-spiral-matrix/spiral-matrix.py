class Solution:
    def spiralOrder(self, matrix: List[List[int]]) -> List[int]:
        #for left , right , top and bottom we do not store them as direct coordinates but only the leftmost side of the matrix or the top most side of the matrix
        #also , bottom and right pointers are padded by 1 for ease
        left, top = 0 , 0       
        bottom, right = len(matrix) , len(matrix[0])
        res = []

        while left < right and top < bottom:
            #adding all elements for the top row and right column
            for i in range(left,right):
                res.append(matrix[top][i])
            top += 1
            for i in range(top,bottom):
                res.append(matrix[i][right-1])
            right -= 1

            #we need to check mid loop for singular row inputs if we have completed them
            if not(left < right and top < bottom):
                break

            #now for the bottom row and left column
            for i in range(right-1,left-1, -1):
                res.append(matrix[bottom-1][i])
            bottom -= 1
            for i in range(bottom-1,top-1, -1):
                res.append(matrix[i][left])
            left += 1
        
        return res
        