import './App.css'
import Header from './components/Header/hind'
import SalesCard from './components/SalesCard/scInd'

function App() {

  return (
    <>
      <Header/>
      <main>
        <section id="sales">
          <div className="dsmeta-container">
            <SalesCard/>
          </div>
        </section>
      </main>
    </>
  )
}

export default App
