import { GoogleGenerativeAI } from "@google/generative-ai";

const genAI = new GoogleGenerativeAI("YOUR_API_KEY_HERE");
const model = genAI.getGenerativeModel({ model: "gemini-1.5-flash" });

const generateReport = async (studentData) => {
  const prompt = `Based on these grades: ${studentData.grade}, 
                  and this target: ${studentData.target}, 
                  write a professional 2-sentence feedback comment 
                  using the Global Citizens framework.`;

  const result = await model.generateContent(prompt);
  return result.response.text();
};
