# Text classifier 2

Service for text classification using several classifier algorithms including neural networks, naive bayes etc.
Source of inspiration was taken from https://github.com/RusZ/TextClassifier.

Currently project is being actively developed.

Project use Gradle 4.2 build platform with 2 submodules:
- textclassifier2_core - almost pure java app incapsulates core logic layer
- textclassifier_service - spring boot 2.0. async app incapsulates service layer and infrastructure (storage) layer

## Requirements

- Java SE Development Kit 8 (`jdk-1.8`)
- Intellij 2017 (recommended) with lombock plugin
- MongoDB ('v.3.6.0')

## Dependencies
- Encog Machine Learning Framework (`org.encog:encog-core:3.3.0`)
- Apache POI (`org.apache.poi:poi-ooxml:3.16`)
- Spring ('5.0')
- JUnit (`junit:junit:4.12`)

## Quick start guide

1. When you compile and launch textclassifier_service application first time, it will start Netty web server on 127.0.0
.1:8080 and deploy REST interface. For API description look at sources

2. When you compile and launch textclassifier_Core it will automatically read xsl file texts for testing inside
project:
<p align="center">
  <img src ="https://github.com/ripreal/textclassifier2/raw/master/textclassifier2_core/images/xlsx_example.png"/>
</p>

After that application will build vocabulary, create and train neural network for each Characteristic.

## Author
- ripreal

## License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.

TODO
- Mention about DDD paradygme in description
- Transfer network learning to Apache Ignite platform or S3 Cloud
# Text Classifier

