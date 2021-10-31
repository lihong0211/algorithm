function selectSort (arr) {
  let min = arr[0]
  let minIndex = 0
  for (let i = 0; i < arr.length; i++) {
    for (let j = i; j < arr.length; j++) {
      if (arr[j] < min) {
        minIndex = j
      }
    }
    swap(arr, i, j)
  }
  function swap(arr, m, n) {
    const temp = arr[m]
    arr[m] = arr[n]
    arr[n] = temp
  }
}