
InputStream inputStream;
OutputStream outputStream;

try {
  
  inputStream = Files.newInputStream(Paths.get("bla/blub/input.txt"));
  outputStream = Files.newOutputStream(Paths.get("bla/blub/output.txt"));
  
  IOUtils.copy(inputStream, outputStream);

} catch (IOException e) {
  throw new RuntimeException(e);
} finally {
  if (inputStream!= null)
  	inputStream.close();
  
  if (outputStream!=null)
  	outputStream.close();
}


