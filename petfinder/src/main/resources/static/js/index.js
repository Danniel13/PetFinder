
export const toggleMoreInformation = () => {
  const moreInformationBtns = Array.from(document.getElementsByClassName('btn-information'));
  
  moreInformationBtns.forEach(btn => {
      btn.addEventListener('click', () => {
          const cardSection = btn.parentElement.parentElement;
          const moreInformationParagraph = cardSection.querySelector('p.more-info')
          const paragraphStyles = getComputedStyle(moreInformationParagraph);
          
          if (paragraphStyles.display === 'none') {
              moreInformationParagraph.style.display = 'block';
              btn.innerText = 'Ocultar';
          } else {
              moreInformationParagraph.style.display = 'none';
              btn.innerText = 'Más información';
          };
      });  
  })    
}





